
#include <iostream>
#include <stdexcept>
#include "CheckingAccount.h"

using namespace std;

CheckingAccount::CheckingAccount(double initialBalance, double fee)
    : Account(initialBalance), transactionFee(0.0) { 
    if (fee >= 0.0) {
        transactionFee = fee;
    }
    else {
        throw invalid_argument("Transaction fee must be >= 0.0");
    }
}

void CheckingAccount::credit(double amount) {
    Account::credit(amount); 
    chargeFee();
}

bool CheckingAccount::debit(double amount) {
    bool success{ Account::debit(amount) }; 

    if (success) { 
        chargeFee();
        return true;
    }
    else { 
        return false;
    }
}

// subtract transaction fee
void CheckingAccount::chargeFee() {
    Account::setBalance(getBalance() - transactionFee);
    cout << "$" << transactionFee << " transaction fee charged." << endl;
}