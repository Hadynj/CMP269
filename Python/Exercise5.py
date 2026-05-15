# CMP 269: Programming Methods III
# In-Class Assignment: Stock Data Analysis
import pandas as pd
import numpy as np
"""
INSTRUCTIONS:
You are an analyst at Lehman Capital. You have been handed a messy dataset
containing a week of trading data.
Complete the 4 tasks below to clean and analyze the stock.
"""

def get_messy_market_data():
    """Helper function providing the raw data for today's lab."""
    return pd.DataFrame({
        "Date": ["Mon", "Tue", "Wed", "Thu", "Fri"],
        "Open": [200.0, 202.5, np.nan, 201.0, 205.0],
        "Close": [203.0, np.nan, 199.0, 204.5, 208.0],
        "Volume": [1500000, 1800000, 1200000, np.nan, 2100000]
    })


def task_1_data_cleaning():
    """
    TASK 1: Clean the Data

    1. Load the messy data using get_messy_market_data().
    2. Print the number of missing values in each column.
    3. Fill missing Volume values with 0.
    4. Drop rows with missing Open or Close values.
    5. Return the cleaned DataFrame.
    """

    print("\n--- Task 1: Data Cleaning ---\n")

    # Load data
    df = get_messy_market_data()

    # Check missing values
    print("Missing values in each column:")
    print(df.isnull().sum())

    # Fill Volume NaNs with 0
    df["Volume"] = df["Volume"].fillna(0)

    # Drop rows with remaining NaNs
    clean_df = df.dropna()

    # Print cleaned DataFrame
    print("\nCleaned DataFrame:")
    print(clean_df)

    return clean_df