import re

def extract_emails(text):
    pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
    emails = re.findall(pattern, text)
    return emails


input_text = input()

extracted_emails = extract_emails(input_text)
for email in extracted_emails:
    print(email)

