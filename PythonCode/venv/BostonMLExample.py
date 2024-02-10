from sklearn.datasets import load_boston
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error

boston = load_boston()

X_train, X_test, Y_train, Y_test = train_test_split(boston.data, boston.target, test_size=0.2, random_state=0)


regr = LinearRegression()
regr.fit(X_train, Y_train)
Y_pred = regr.predict(X_test)

print("MAE: ", mean_absolute_error(Y_test, Y_pred))