public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    // RADIO STATION
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next(int newRadioStation) {
        if (newRadioStation >= 0 && newRadioStation <= 8) {
            currentRadioStation = ++newRadioStation;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev(int newRadioStation) {
        if (newRadioStation >= 1 && newRadioStation <= 9) {
            currentRadioStation = --newRadioStation;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    // SOUND VOLUME
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseVolume(int newSoundVolume) {
        if (newSoundVolume >= 0 && newSoundVolume <= 9) {
            currentSoundVolume = ++newSoundVolume;
        } else {
            currentSoundVolume = 10;
        }
    }

    public void decreaseVolume(int newSoundVolume) {
        if (newSoundVolume >= 1 && newSoundVolume <= 10) {
            currentSoundVolume = --newSoundVolume;
        } else {
            currentSoundVolume = 0;
        }
    }
}
