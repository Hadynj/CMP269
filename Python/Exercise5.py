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

def task_2_volatility_filtering(clean_df):
    """
    TASK 2: Filter for Volatility

    1. Accept the clean_df from Task 1.
    2. Create a new column called 'Price_Swing'
       representing between 'Close' and 'Open' (Close - Open).
    3. Filter days where Price_Swing > 2.00
       OR Price_Swing < -2.00.
    """

    print("\n--- Task 2: Volatility Filtering ---\n")

    # Calculate Price Swing
    clean_df["Price_Swing"] = clean_df["Close"] - clean_df["Open"]

    # Apply filter
    volatile_days = clean_df[
        (clean_df["Price_Swing"] > 2.0) |
        (clean_df["Price_Swing"] < -2.0)
    ]

    print(volatile_days)



def task_3_financial_summary(clean_df):
    """
    TASK 3: Basic Statistics

    1. Accept the clean_df from Task 1.
    2. Use describe() on the Close column and print tbe result.
    3. Manually calculate and print the max 'Volume' for the week 
    """

    print("\n--- Task 3: Financial Summary ---\n")

    # Describe Close column
    print("Close Price Statistics:")
    print(clean_df["Close"].describe())

    # Max Volume
    max_volume = clean_df["Volume"].max()

    print("\nMaximum Volume for the week:")
    print(max_volume)


def task_4_algorithmic_metrics(clean_df):
    """
    TASK 4: Moving Averages & Returns

    1. Accept the clean_df from Task 1.
    2. Add Daily_Return using pct_change().
    3. Add 2_Day_MA using rolling mean.
    4. Print the final DataFrame.
    """

    print("\n--- Task 4: Algorithmic Metrics ---\n")

    # Add Daily Return column
    clean_df["Daily_Return"] = clean_df["Close"].pct_change()

    # Add 2-Day Moving Average column
    clean_df["2_Day_MA"] = clean_df["Close"].rolling(window=2).mean()

    # Print final DataFrame
    print(clean_df)


if __name__ == "__main__":

    # Run tasks
    clean_df = task_1_data_cleaning()

    if clean_df is not None:
        task_2_volatility_filtering(clean_df.copy())
        task_3_financial_summary(clean_df.copy())
        task_4_algorithmic_metrics(clean_df.copy())