module CreateAccount.Page {
    requires java.desktop;
    exports AccountPackage;
    requires Dashboard.Page;
    requires java.sql;
}