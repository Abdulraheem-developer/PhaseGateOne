import datetime


last_period_input = input("Enter the first day of your last period (yyyy-mm-dd): ")
cycle_length = int(input("Enter your average cycle length (in days): "))
period_length = int(input("Enter your period duration (in days): "))


last_period = datetime.datetime.strptime(last_period_input, "%Y-%m-%d").date()


next_period = last_period + datetime.timedelta(days=cycle_length)


ovulation_day = next_period - datetime.timedelta(days=14)


fertile_start = ovulation_day - datetime.timedelta(days=5)
fertile_end = ovulation_day + datetime.timedelta(days=1)


safe_start1 = last_period + datetime.timedelta(days=period_length)
safe_end1 = fertile_start - datetime.timedelta(days=1)


safe_start2 = fertile_end + datetime.timedelta(days=1)
safe_end2 = next_period - datetime.timedelta(days=1)


print("\n---- Menstrual Cycle Details ----")
print("Next period starts:", next_period)
print("Ovulation Day:", ovulation_day)
print("Fertile Window:", fertile_start, "to", fertile_end)
print("Safe Periods:")
print("- Before Ovulation:", safe_start1, "to", safe_end1)
print("- After Ovulation:", safe_start2, "to", safe_end2)
