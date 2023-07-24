
def convert_to_html(title, content, comments):
    html_output  = f"<h1>\n    {title}\n</h1>\n"
    html_output += f"<article>\n    {content}\n</article>"

    for comment in comments:
        html_output += f"\n<div>\n    {comment}\n</div>"
    return html_output


title = input()
content = input()

comments = []
while True:
    comment = input()
    if comment == "end of comments":
        break

    comments.append(comment)

html_result = convert_to_html(title, content, comments)
print(html_result)
