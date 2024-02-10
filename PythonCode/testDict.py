# Create dictionary holding students
students = {
    1: {
        "name": "Laurence",
        "grade": 12,
        "classes": ["History", "AutoCAD", "English"]
    },
    2: {
        "name": "Frank",
        "grade": 12,
        "classes": ["History", "Typing", "English"]
    },
    1: {
        "name": "George"
    }
}

# Prints entire dictionary
print(students)

# Prints "Laurence"
print(students[1]["name"])

# Prints "["History", "Typing", "English"]"
print(students[2]["classes"])

# Errors out because sub-object classes doesn't exist
print(students[1]["classes"][2])
