

let cstName = prompt("What is the customer's name?: ");

// Get first item details
let item = prompt("What did the user buy?: ");
let quantity = parseInt(prompt("How many pieces?: "));
let unitPrice = parseFloat(prompt("How much per unit?: "));


let request = prompt("Add more items?: ");


let item2 = "";
let quantity2 = 0;
let unitPrice2 = 0;

if (request.toLowerCase() === "yes") {
    item2 = prompt("What did the user buy?: ");
    quantity2 = parseInt(prompt("How many pieces?: "));
    unitPrice2 = parseFloat(prompt("How much per unit?: "));
}

let cashiersName = prompt("What is your name?: ");


let discount = parseFloat(prompt("How much discount will he get?: "));


let itemTotal = quantity * unitPrice;


let itemTotal2 = 0;
if (request.toLowerCase() === "yes") {
    itemTotal2 = quantity2 * unitPrice2;
}


let subtotalBeforeDiscount = itemTotal + itemTotal2;
let discountAmount = subtotalBeforeDiscount * (discount / 100);
let subtotal = subtotalBeforeDiscount - discountAmount;
let vat = subtotal * 0.075;
let billTotal = subtotal + vat;


console.log("\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 03293828343");
console.log("Date: 18-Dec-22 8:48:11 pm");
console.log("Cashier: " + cashiersName);
console.log("Customer Name: " + cstName);
console.log("====================================================");
console.log("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)");
console.log("----------------------------------------------------");
console.log(item + "\t\t" + quantity + "\t" + unitPrice + "\t\t" + itemTotal);


if (request.toLowerCase() === "yes") {
    console.log(item2 + "\t\t" + quantity2 + "\t" + unitPrice2 + "\t\t" + itemTotal2);
}

console.log("----------------------------------------------------");
console.log("\t\t\tSub Total:\t" + subtotalBeforeDiscount);
console.log("\t\t\tDiscount:\t" + discountAmount);
console.log("\t\t\tVAT @ 7.50%:\t" + vat);
console.log("====================================================");
console.log("\t\t\tBill Total:\t" + billTotal);
console.log("====================================================");
console.log("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
console.log("====================================================");

let amountPaid = parseFloat(prompt("How much did the customer give to you?: "));


let change = amountPaid - billTotal;
console.log("Amount Paid: " + amountPaid);
console.log("Balance: " + change);


function displayWithAlert() {
    let invoiceText = "\nSEMICOLON STORES\n";
    invoiceText += "MAIN BRANCH\n";
    invoiceText += "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n";
    invoiceText += "TEL: 03293828343\n";
    invoiceText += "Date: 18-Dec-22 8:48:11 pm\n";
    invoiceText += "Cashier: " + cashiersName + "\n";
    invoiceText += "Customer Name: " + cstName + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)\n";
    invoiceText += "----------------------------------------------------\n";
    invoiceText += item + "\t\t" + quantity + "\t" + unitPrice + "\t\t" + itemTotal + "\n";
    
    if (request.toLowerCase() === "yes") {
        invoiceText += item2 + "\t\t" + quantity2 + "\t" + unitPrice2 + "\t\t" + itemTotal2 + "\n";
    }
    
    invoiceText += "----------------------------------------------------\n";
    invoiceText += "\t\t\tSub Total:\t" + subtotalBeforeDiscount + "\n";
    invoiceText += "\t\t\tDiscount:\t" + discountAmount + "\n";
    invoiceText += "\t\t\tVAT @ 7.50%:\t" + vat + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "\t\t\tBill Total:\t" + billTotal + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "THIS IS NOT A RECEIPT KINDLY PAY " + billTotal + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "Amount Paid: " + amountPaid + "\n";
    invoiceText += "Balance: " + change;
    
    alert(invoiceText);
}


