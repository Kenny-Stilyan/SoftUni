
def decrypt_message(key, message):
    decrypted_message = ""
    key_length = len(key)
    key_index = 0

    for char in message:
        decrypted_char = chr(ord(char) - int(key[key_index]))
        decrypted_message += decrypted_char

        key_index = (key_index + 1) % key_length

    return decrypted_message


def find_treasure(decrypted_message):
    start_index = decrypted_message.find("&")
    end_index = decrypted_message.find("&", start_index + 1)
    treasure_type = decrypted_message[start_index + 1:end_index]

    start_index = decrypted_message.find("<", end_index)
    end_index = decrypted_message.find(">", start_index + 1)
    coordinates = decrypted_message[start_index + 1:end_index]

    return treasure_type, coordinates


key_sequence = input().split()

message_lines = []
while True:
    line = input()
    if line == "find":
        break
    message_lines.append(line)

for line in message_lines:
    decrypted_message = decrypt_message(key_sequence, line)
    treasure_type, coordinates = find_treasure(decrypted_message)
    print(f"Found {treasure_type} at {coordinates}")
