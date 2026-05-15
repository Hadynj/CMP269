# CMP 269: Programming Methods III
# In-Class Assignment: Data Visualization and Pytest

import pandas as pd
import matplotlib.pyplot as plt
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