
def morse_code_translator(morse_code):
    morse_dict = {
        ".-"  : "A", "-...": "B", "-.-.": "C", "-.." : "D", "."   : "E",
        "..-.": "F", "--." : "G", "....": "H", ".."  : "I", ".---": "J",
        "-.-" : "K", ".-..": "L", "--"  : "M", "-."  : "N", "---" : "O",
        ".--.": "P", "--.-": "Q", ".-." : "R", "..." : "S", "-"   : "T",
        "..-" : "U", "...-": "V", ".--" : "W", "-..-": "X", "-.--": "Y",
        "--..": "Z"
    }

    words = morse_code.strip().split(" | ")
    translated_words = []

    for word in words:
        letters = word.split(" ")
        translated_word = "".join([morse_dict[letter] for letter in letters if letter in morse_dict])
        translated_words.append(translated_word)

    return " ".join(translated_words)


morse_code_input = input()
english_output = morse_code_translator(morse_code_input)
print(english_output)
