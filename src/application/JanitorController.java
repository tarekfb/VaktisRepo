package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.net.httpserver.Authenticator.Result;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;


public class JanitorController implements Initializable {
	
	/*
	@FXML
	private TableView<String> tableViewKeys;
	@FXML
    private TableColumn<String, String> columnID, columnOwner, columnStatus, columnType, columnOffice;
	*/
	
	 @FXML
	 TableView<String[]> tv = new TableView();
	 @FXML
	 TableColumn<String[],String> idColumn = new TableColumn();
	 @FXML
	 TableColumn<String[],String> ownerColumn = new TableColumn();
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	/*
	List<String> mockListID = new ArrayList<String>();
	List<String> mockListOwner = new ArrayList<String>();
	List<String> mockListStatus = new ArrayList<String>();
	List<String> mockListType = new ArrayList<String>();
	List<String> mockListOffice = new ArrayList<String>();

	String id1 = "N0001";
	String id2 = "N0002";
	*/
	
    // Create the data structure
    String[][] data = new String[5][2];
    data[0] = new String[]{"Jon Skeet","876k"};
    data[1] = new String[]{"Darin Dimitrov","670k"};
    data[2] = new String[]{"BalusC","660k"};
    data[3] = new String[]{"Hans Passant","635k"};
    data[4] = new String[]{"Marc Gravell","610k"};

   
    tv.getColumns().addAll(idColumn,ownerColumn);
    

    idColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<String[], String> p) {
            String[] x = p.getValue();
            if (x != null && x.length>0) {
                return new SimpleStringProperty(x[0]);
            } else {
                return new SimpleStringProperty("<no name>");
            }
        }
    });

    idColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<String[], String> p) {
            String[] x = p.getValue();
            if (x != null && x.length>1) {
                return new SimpleStringProperty(x[1]);
            } else {
                return new SimpleStringProperty("<no value>");
            }
        }
    });

    // Add Data
    tv.getItems().addAll(Arrays.asList(data));
	
	
	
	}
}
