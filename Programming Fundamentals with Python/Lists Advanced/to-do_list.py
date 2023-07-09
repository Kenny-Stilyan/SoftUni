
def todo_note():
    todo_notes_list = []

    while True:
        note = input()
        if note == "End":
            break

        todo_notes_list.append(note)

    sorted_notes = sorted(todo_notes_list, key=lambda x: int(x.split("-")[0]))
    result_notes = [note.split("-")[1] for note in sorted_notes]
    return result_notes

print(todo_note())
