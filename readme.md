src/main/java/com/coderlang
├── /api
│   ├── Api.java
│   ├── Api.manager.java
│   ├── ApiRunner.java
│   ├── ApiRunner.manager.java
│   ├── ApiCommand.java
│   ├── ApiCommand.manager.java
│   ├── ApiDiscord.java
│   └── ApiDiscord.manager.java
├── /bot
│   ├── Bot.java
│   ├── Bot.manager.java
│   ├── BotRunner.java
│   └── /core
│       ├── CommandRegistry.java
│       └── CommandRegistry.manager.java
├── /compiler
│   ├── Compiler.java
│   ├── Compiler.manager.java
│   ├── Parser.java
│   ├── Parser.manager.java
│   ├── Tokenizer.java
│   ├── Tokenizer.manager.java
│   ├── Token.java
│   └── /ast
│       ├── AST.java
│       └── AST.manager.java
├── /commands
│   ├── Nomention.command.java
│   ├── Ping.command.java
│   ├── AuthorID.command.java
│   ├── AuthorURL.command.java
│   └── Reply.command.java
|   |   ....
|   |
│   ├── /interaction
│   │   ├── Slash.command.java
│   │   └── ButtonClick.command.java
│   └── CommandHandler.java
├── /console
│   ├── Console.java
│   ├── Console.manager.java
│   └── ConsoleHandler.java
├── /config
│   ├── Config.java
│   └── cordlang.json
├── /events
│   ├── EventDispatcher.java
│   └── EventDispatcher.manager.java
├── /token
│   ├── Token.java
│   └── Token.manager.java
└── Index.java
