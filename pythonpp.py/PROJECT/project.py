import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.metrics import classification_report
import re
import string
df_fake = pd.read_csv("Fake.csv")
df_true =pd.read_csv("True.csv")