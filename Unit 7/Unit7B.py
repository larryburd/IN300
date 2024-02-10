import numpy as np

data = np.loadtxt("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 7\\IN300_Dataset2.txt")

# Reshape data into a 2d matrix
matrix_2d = data.reshape(2500, 100)

print(matrix_2d)

# Reshape into a 3d matrix
matrix_3d = data.reshape(2500, 10, 10)

print(matrix_3d)

# Slice the matrix
slice = matrix_2d[2:5:10, :]

print(slice)
