BEGIN
    FOR loan IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || loan.CustomerID
            || ' Loan '
            || loan.LoanID
            || ' is due on '
            || TO_CHAR(loan.EndDate,'DD-MON-YYYY')
        );

    END LOOP;
END;
/