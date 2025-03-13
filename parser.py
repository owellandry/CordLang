from lark import Lark
from lark.indenter import Indenter

# Definimos nuestro indenter para gestionar la indentación (4 espacios por nivel)
class CXLIndenter(Indenter):
    NL_type = "_NEWLINE"
    OPEN_PAREN_types = []  # No usamos paréntesis en este lenguaje
    CLOSE_PAREN_types = []
    INDENT_type = "_INDENT"
    DEDENT_type = "_DEDENT"
    tab_len = 4

# Cargar la gramática desde el archivo
with open("cordlang.lark") as file:
    grammar = file.read()

# Creamos el parser usando el lexer "contextual" y nuestro postlexer (indenter)
parser = Lark(grammar, start="start", parser="lalr", lexer="contextual", postlex=CXLIndenter())

def parse_cordlang_file(file_path):
    with open(file_path, "r") as file:
        code = file.read()
        print("Code being parsed:", repr(code))
    try:
        tree = parser.parse(code)
        print(tree.pretty())
    except Exception as e:
        print("Error de sintaxis:", e)

# Analizar el archivo main.cxl
parse_cordlang_file("main.cxl")
