import pickle
import urllib
from sklearn.datasets import fetch_openml
from sklearn.datasets import load_svmlight_file
from sklearn.datasets import fetch_covtype
from sklearn.datasets import fetch_20newsgroups

In: mnist = fetch_openml("MNIST original")
pickle.dump(mnist, open( "mnist.pickle", "wb"))

In: target_page = 'http://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/binary/ijcnn1.bz2'
with urllib.request.urlopen(target_page) as response:
    with open('ijcnn1.bz2', 'wb') as W:
        W.write(response.read())
