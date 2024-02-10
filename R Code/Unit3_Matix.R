# Create matrix and assign values
trainsMatrix <- matrix(c(Locomotive1="Steam", Locomotive2="Diesel", 
                  Locomotive3="Electric", Locomotive4="Coal", 
                  Locomotive5="Wood", Common="Combined Engines"),
                  nrow=6)

# Set row list and column heading
dimnames(trainsMatrix) = list(c("Locomotive1", "Locomotive2", "Locomotive3", 
                                "Locomotive4", "Locomotive5", "Common"),
                              c("Train Type"))

# Print the matrix
print(trainsMatrix)