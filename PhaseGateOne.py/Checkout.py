try:
    cst_name = input("What is the customer's name?: ")
    if not cst_name:
        raise ValueError("Customer name is required.")

    item = input("What did the user buy?: ")
    if not item:
        raise ValueError("Item name is required.")

    quantity = int(input("How many pieces?: "))
    unit_price = float(input("How much per unit?: "))

    request = input("Add more items?: ").lower()
    if not request:
        raise ValueError("Request input is required.")

except ValueError as e:
    print("Input Error:", e)
    


item2 = ""
quantity2 = 0
unit_price2 = 0.0

if request == "yes":
    try:
        item2 = input("What did the user buy?: ")
        if not item2:
            raise ValueError("Second item name is required.")
        
        quantity2 = int(input("How many pieces?: "))
        unit_price2 = float(input("How much per unit?: "))
    except ValueError as e:
        print("Second Item Input Error:", e)
        exit()

try:
    cashiers_name = input("What is your name?: ")
    if not cashiers_name:
        raise ValueError("Cashier name is required.")

    discount = float(input("How much discount will he get?: "))
    if discount < 0:
        raise ValueError("Discount can't be negative.")
except ValueError as e:
    print("Input Error:", e)
    


item_total = quantity * unit_price
item_total2 = quantity2 * unit_price2 if request == "yes" else 0
subtotal_before_discount = item_total + item_total2
discount_amount = subtotal_before_discount * (discount / 100)
subtotal = subtotal_before_discount - discount_amount
vat = subtotal * 0.075
bill_total = subtotal + vat

print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print("Date: 18-Dec-22 8:48:11 pm")
print("Cashier:", cashiers_name)
print("Customer Name:", cst_name)
print("================================================
