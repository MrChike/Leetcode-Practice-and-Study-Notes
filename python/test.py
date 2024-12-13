import time

class BinarySearch():
    def __init__(self):
        self.start_time = time.time()
        self.array = list(range(1, 1000000000 + 1)) #TODO: Figure out why i billion breaks
        self.target = 1000000000
        self.divisor = 2

    def brute_force_approach(self):
        for i in self.array:
            if i == self.target:
                break

        end_time = time.time()
        elapsed_time = end_time - self.start_time
        print(f"Brute Force Approach Execution time: {elapsed_time} seconds for target ==> {i}")

    def my_optimized_approach(self):
        # Can only handle 10 million
        while True:
            if len(self.array) == 1:
                break

            remainder = round(len(self.array)/self.divisor)
            left_side = self.array[:remainder]
            right_side = self.array[remainder:]

            if self.target in left_side:
                self.array = left_side

            if self.target in right_side:
                self.array = right_side


        end_time = time.time()
        elapsed_time = end_time - self.start_time
        print(f"Optimized Approach Execution time: {elapsed_time} seconds for target ==> {self.array[0]}")

    def gpt_sensei_approach(self):
        # Can only handle 10 million
        left = 0
        right = len(self.array) - 1

        while True:
            if left == right:  # Only one element left
                break

            remainder = round((right - left) / self.divisor) + left
            # Instead of slicing, use the index to simulate the division of the array
            if self.target == self.array[remainder]:
                break
            elif self.target < self.array[remainder]:
                right = remainder - 1  # Focus on the left side
            else:
                left = remainder + 1  # Focus on the right side

        end_time = time.time()
        elapsed_time = end_time - self.start_time
        print(f"GPT Sensei Approach Execution time: {elapsed_time} seconds for target ==> {self.array[left]}")

    def optimized_approach(self):
        left, right = 0, len(self.array) - 1

        while left <= right:
            # Calculate the midpoint index
            remainder = (right + left) // self.divisor  # divide by 2 to find the middle
            # Use the midpoint to divide the array
            # Instead of slicing, work with indices directly
            if self.target == self.array[remainder]:
                break
            elif self.target < self.array[remainder]:
                right = remainder - 1  # Focus on the left part of the array
            else:
                left = remainder + 1  # Focus on the right part of the array

        end_time = time.time()
        elapsed_time = end_time - self.start_time
        print(f"Optimized Approach Execution time: {elapsed_time} seconds for target ==> {self.array[remainder]}")


# BinarySearch().brute_force_approach()
# BinarySearch().my_optimized_approach()
# BinarySearch().gpt_sensei_approach()
BinarySearch().optimized_approach()