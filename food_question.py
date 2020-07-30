#!/usr/bin/env python3

# Dictionary to keep track of food likes
counter = {}

# Open up the favorite foods log and count frequencies using the dictionary
with open("favorite_foods.log", "r") as f:
    for line in f:
        item = line.strip()
        if item not in counter:
            counter[item] = 1
        else:
            counter[item] += 1

# Print out all the available liked foods
print("Select your favorite food below:")
for item in counter:
    print(item)
