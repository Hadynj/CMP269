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
