
def is_valid_move(maze, visited, row, col):
    num_rows = len(maze)
    num_cols = len(maze[0])

    # Check if the move is within the maze boundaries
    if row < 0 or row >= num_rows or col < 0 or col >= num_cols:
        return False

    # Check if the move is not a wall and has not been visited before
    if maze[row][col] == '#' or visited[row][col]:
        return False

    return True

def dfs(maze, visited, row, col, num_moves):
    num_rows = len(maze)
    num_cols = len(maze[0])

    # Check if Kate has reached the maze boundaries
    if row == 0 or row == num_rows - 1 or col == 0 or col == num_cols - 1:
        return num_moves

    # Mark the current position as visited
    visited[row][col] = True

    # Explore the four possible moves: up, down, left, right
    moves = [(row-1, col), (row+1, col), (row, col-1), (row, col+1)]
    longest_path = 0

    for move in moves:
        next_row, next_col = move

        if is_valid_move(maze, visited, next_row, next_col):
            path_length = dfs(maze, visited, next_row, next_col, num_moves + 1)
            longest_path = max(longest_path, path_length)

    # Mark the current position as unvisited (backtracking)
    visited[row][col] = False

    return longest_path

def find_way_out(maze):
    num_rows = len(maze)
    num_cols = len(maze[0])

    # Find Kate's initial position
    start_row, start_col = None, None
    for row in range(num_rows):
        for col in range(num_cols):
            if maze[row][col] == 'k':
                start_row, start_col = row, col
                break

    # Initialize the visited matrix
    visited = [[False] * num_cols for _ in range(num_rows)]

    # Run DFS to find the longest path
    longest_path = dfs(maze, visited, start_row, start_col, 1)

    if longest_path > 1:
        return f"Kate got out in {longest_path} moves"
    else:
        return "Kate cannot get out"


# Take input for the number of rows
num_rows = int(input())

# Take input for the maze
maze = []
for _ in range(num_rows):
    row = input().strip()
    maze.append(row)

result = find_way_out(maze)
print(result)
