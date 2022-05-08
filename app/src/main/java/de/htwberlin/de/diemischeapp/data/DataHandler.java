package de.htwberlin.de.diemischeapp.data;

import java.util.List;
import java.util.Optional;

import de.htwberlin.de.diemischeapp.model.Bed;
import de.htwberlin.de.diemischeapp.model.Crop;

public interface DataHandler {

    /**
     * Returns a optional List of Crops form database
     * @return
     */
    Optional<List<Crop>> fetchCrops();

    /**
     * Returns a optional List of Beds from Database
     * @return
     */
    Optional<List<Bed>> fetchBeds();

    /**
     * returns a optional List of selected Crops from database
     * @return
     */
    Optional<List<Crop>> fetchSelection();

    /**
     * uploads the bed list to the Database
     * @param beds
     */
    void uploadBeds(List<Bed> beds);

    /**
     * Uploads the SelectedList to the Database
     * @param crops
     */
    void uploadSelection(List<Crop> crops);
}
