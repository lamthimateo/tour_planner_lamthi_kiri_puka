module tour_planner_lamthi_kiri_puka {
    requires javafx.controls;
    requires javafx.fxml;


    opens tour_planner_lamthi_kiri_puka to javafx.fxml;
    exports tour_planner_lamthi_kiri_puka;
    exports tour_planner_lamthi_kiri_puka.controller;
    opens tour_planner_lamthi_kiri_puka.controller to javafx.fxml;
}