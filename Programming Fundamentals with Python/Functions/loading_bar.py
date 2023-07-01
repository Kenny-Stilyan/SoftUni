
def loading_bar(progress):
    bar_length = progress // 10
    percentage = progress
    bar = f"[{'%' * bar_length}{'.' * (10 - bar_length)}]"

    if progress == 100:
        return f"{percentage}% Complete!\n{bar}"
    else:
        return f"{percentage}% {bar}\nStill loading..."


progress = int(input())
result = loading_bar(progress)
print(result)
