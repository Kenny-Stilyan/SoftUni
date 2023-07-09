
# DFS --> Depth-First Search
def dfs(board, row, col, visited):
    # Check if the current position is valid and not visited
    if row < 0 or row >= len(board) or col < 0 or col >= len(board[0]) or visited[row][col] or board[row][col] == '-':
        return 0
    
    # Mark the current position as visited
    visited[row][col] = True

    # Perform DFS in all four directions
    count = 1
    count += dfs(board, row + 1, col, visited)  # Down
    count += dfs(board, row - 1, col, visited)  # Up
    count += dfs(board, row, col + 1, visited)  # Right
    count += dfs(board, row, col - 1, visited)  # Left

    return count

def find_largest_count(board):
    rows = len(board)
    cols = len(board[0])

    largest_count = 0
    visited = [[False] * cols for _ in range(rows)]

    # Iterate over each position on the board
    for row in range(rows):
        for col in range(cols):
            # If the position is a dot and not visited, perform DFS
            if board[row][col] == '.' and not visited[row][col]:
                count = dfs(board, row, col, visited)
                largest_count = max(largest_count, count)

    return largest_count

# Read the input
n = int(input())
board = []
for _ in range(n):
    row = input().split()
    board.append(row)

# Find the largest count of connected dots
largest_count = find_largest_count(board)
print(largest_count)
