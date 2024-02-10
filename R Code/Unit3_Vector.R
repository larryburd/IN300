# Create vector and assign values
trains <- c(Locomotive1="Steam", Locomotive2="Diesel", Locomotive3="Electric", 
            Locomotive4="Coal", Locomotive5="Wood", Common="Combined Engines")

# Loop through each vector element and print the contents
for(label in names(trains)) {
  trainName<-trains[label]
  print(paste(label, "= ", trainName))
}

testVect <- c(TRUE, "Test")

print(testVect)