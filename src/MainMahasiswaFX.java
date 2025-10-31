import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainMahasiswaFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField namaField = new TextField();
        TextField nimField = new TextField();
        TextField jurusanField = new TextField();
        TextField umurField = new TextField();

        Button simpanBtn = new Button("Simpan");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Nama:"), 0, 0);
        grid.add(namaField, 1, 0);
        grid.add(new Label("NIM:"), 0, 1);
        grid.add(nimField, 1, 1);
        grid.add(new Label("Jurusan:"), 0, 2);
        grid.add(jurusanField, 1, 2);
        grid.add(new Label("Umur:"), 0, 3);
        grid.add(umurField, 1, 3);
        grid.add(simpanBtn, 1, 4);

        simpanBtn.setOnAction(e -> {
            Mahasiswa1 mhs = new Mahasiswa1();
            try {
                mhs.setNama(namaField.getText());
                mhs.setNim(nimField.getText());
                mhs.setJurusan(jurusanField.getText());
                mhs.setUmur(Integer.parseInt(umurField.getText()));

                Alert info = new Alert(Alert.AlertType.INFORMATION);
                info.setTitle("Data Mahasiswa");
                info.setHeaderText("Data Berhasil Disimpan");
                info.setContentText(
                        "Nama: " + mhs.getNama() + "\n" +
                        "NIM: " + mhs.getNim() + "\n" +
                        "Jurusan: " + mhs.getJurusan() + "\n" +
                        "Umur: " + mhs.getUmur()
                );
                info.showAndWait();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error Input");
                error.setHeaderText("Input Tidak Valid");
                error.setContentText("Umur harus berupa angka!");
                error.showAndWait();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Terjadi Kesalahan");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });
        
        Scene scene = new Scene(grid, 350, 250);
        primaryStage.setTitle("Form Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
