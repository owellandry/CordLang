import { useState } from 'react'
import './App.css'

function App() {
  const [messages, setMessages] = useState([])
  const [input, setInput] = useState('')

  const handleSend = async () => {
    if (!input.trim()) return
    const newMessages = [...messages, { role: 'user', content: input }]
    setMessages(newMessages)
    setInput('')
    try {
      const res = await fetch('https://openrouter.ai/api/v1/chat/completions', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          Authorization: `Bearer ${import.meta.env.VITE_OPENROUTER_API_KEY}`,
        },
        body: JSON.stringify({
          model: 'openrouter/openai/gpt-3.5-turbo',
          messages: newMessages,
        }),
      })
      const data = await res.json()
      const reply = data.choices?.[0]?.message?.content || 'No response'
      setMessages([...newMessages, { role: 'assistant', content: reply }])
    } catch (err) {
      console.error(err)
    }
  }

  const loginLinks = [
    { provider: 'Discord', url: '#' },
    { provider: 'Google', url: '#' },
    { provider: 'GitHub', url: '#' },
  ]

  return (
    <div className="container">
      <div className="preview">
        <h2>Bot Preview</h2>
        <p>Project preview will appear here.</p>
      </div>
      <div className="chat">
        <div className="login">
          {loginLinks.map((link) => (
            <a key={link.provider} className="login-btn" href={link.url}>
              Sign in with {link.provider}
            </a>
          ))}
        </div>
        <div className="messages">
          {messages.map((m, i) => (
            <div key={i} className={`msg ${m.role}`}>
              {m.content}
            </div>
          ))}
        </div>
        <div className="input-area">
          <input
            value={input}
            onChange={(e) => setInput(e.target.value)}
            placeholder="Type a message"
          />
          <button onClick={handleSend}>Send</button>
        </div>
      </div>
    </div>
  )
}

export default App
