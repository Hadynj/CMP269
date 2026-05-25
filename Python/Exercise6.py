# CMP 269: Programming Methods III
# In-Class Assignment: Data Visualization and Pytest


import pandas as pd
import matplotlib.pyplot as plt
from pyexpat import *
import seaborn as sns

"""
INSTRUCTIONS:
Part A: Complete the visualization tasks to analyze a mock financial dataset.
Part B: Write testable logic and Pytest assertions to verify your financial math.
"""

# ==========================================
# PART A: VISUALIZATION
# ==========================================

def get_crypto_data():
    """Helper function to load mock crypto data."""
    
    return pd.DataFrame({
        "Day": [1, 2, 3, 4, 5, 6, 7],
        "Bitcoin": [40000, 42000, 41000, 45000, 44000, 46000, 48000],
        "Ethereum": [2500, 2600, 2550, 2800, 2750, 2900, 3100]
    })


def task_1_trend_line():
    """
    TASK 1: Matplotlib Line Chart

    1. Load the data using get_crypto_data().
    2. Use plt.plot() to chart Bitcoin prices over the 7 days.
    3. Add a title, x-axis label, and y-axis label.
    4. Call plt.show() to render it.
    """

    print("--- Task 1: Building a Trend Line ---")

    # Load data
    df = get_crypto_data()

    # Create line chart
    plt.plot(df["Day"], df["Bitcoin"], marker='o', color='orange')

    # Add labels and title
    plt.title("Bitcoin Prices Over 7 Days")
    plt.xlabel("Day")
    plt.ylabel("Bitcoin Price (USD)")

    # Add grid for readability
    plt.grid(True)

    # Show chart
    plt.show()
