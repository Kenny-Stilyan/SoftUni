
def add_piece(pieces_dict, piece, composer, key):
    if piece not in pieces_dict:
        pieces_dict[piece] = [composer, key]
        print(f"{piece} by {composer} in {key} added to the collection!")
    else:
        print(f"{piece} is already in the collection!")

def remove_piece(pieces_dict, piece):
    if piece in pieces_dict:
        del pieces_dict[piece]
        print(f"Successfully removed {piece}!")
    else:
        print(f"Invalid operation! {piece} does not exist in the collection.")

def change_key(pieces_dict, piece, new_key):
    if piece in pieces_dict:
        pieces_dict[piece][1] = new_key
        print(f"Changed the key of {piece} to {new_key}!")
    else:
        print(f"Invalid operation! {piece} does not exist in the collection.")


n = int(input())

pieces_dict = {}
for _ in range(n):
    piece, composer, key = input().split("|")
    if piece not in pieces_dict:
        pieces_dict[piece] = [composer, key]

while True:
    command, *args = input().split("|")
    if command == "Stop":
        for key, vals in pieces_dict.items():
            print(f"{key} -> Composer: {vals[0]}, Key: {vals[1]}")
        break

    if command == "Add":
        piece, composer, key = args[0], args[1], args[2]
        add_piece(pieces_dict, piece, composer, key)
    elif command == "Remove":
        piece = args[0]
        remove_piece(pieces_dict, piece)
    elif command == "ChangeKey":
        piece, key = args[0], args[1]
        change_key(pieces_dict, piece, key)


