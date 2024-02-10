# Add values to trains list
trains = [["Locomotive1", "Steam"], ["locomotive2", "Diesel"],
          ["Locomotive3", "Electric"], ["Locomotive4", "Coal"],
          ["Locomotive5", "Wood"], ["Common", "Combined Engines"]]

# Print the first and second element in each sub-list
for elem in trains:
    print(elem[0] + "---->" + elem[1])
