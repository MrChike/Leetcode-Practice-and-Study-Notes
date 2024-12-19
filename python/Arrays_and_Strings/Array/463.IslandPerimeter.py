# https://leetcode.com/problems/island-perimeter/description/?envType=problem-list-v2&envId=ascyfkj5&difficulty=EASY

# class Solution:
#     def islandPerimeter(self, grid):
#         """
#         :type grid: List[List[int]]
#         :rtype: int
#         """
#         rows = len(grid)
#         cols = len(grid[0])
#         visited = set()

#         def dfs(row, col):
#             # If out of bounds or water, contributes 1 to perimeter
#             if row < 0 or row >= rows or col < 0 or col >= cols or grid[row][col] == 0:
#                 return 1
            
#             # If already visited, it does not contribute to the perimeter
#             if (row, col) in visited:
#                 return 0

#             # Mark the cell as visited
#             visited.add((row, col))

#             # Explore all neighbors
#             perimeter = 0
#             perimeter += dfs(row - 1, col)  # Top
#             perimeter += dfs(row + 1, col)  # Bottom
#             perimeter += dfs(row, col - 1)  # Left
#             perimeter += dfs(row, col + 1)  # Right

#             return perimeter

#         # Start DFS from any land cell
#         for rowIndex in range(rows):
#             for colIndex in range(cols):
#                 if grid[rowIndex][colIndex] == 1:
#                     # Perform DFS and calculate the perimeter
#                     return dfs(rowIndex, colIndex)

#         return 0

class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        count = 0
        n = len(grid)
        m = len(grid[0])
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    if i == 0 or grid[i - 1][j] == 0: # top row
                        count += 1
                    if j == 0 or grid[i][j-1] == 0: # left col
                        count += 1
                    if i == n - 1 or grid[i+1][j] == 0: # bottom row
                        count += 1
                    if j == m - 1 or grid[i][j+1] == 0: # right col
                        count += 1
        return count
        