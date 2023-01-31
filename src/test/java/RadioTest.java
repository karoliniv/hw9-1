import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // RADIO STATION
    @Test
    public void shouldTurnOnTheNextRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(4);
        radioStation.next();

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnTheNextRadioStationTransition() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);
        radioStation.next();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(4);
        radioStation.prev();

        int expected = 3;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStationTransition() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);
        radioStation.prev();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheRadioStationAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheRadioStationAboveMin() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // SOUND VOLUME
    @Test
    public void shouldIncreaseSoundVolume() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(4);
        soundVolume.increaseVolume();

        int expected = 5;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeTransition() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(10);
        soundVolume.increaseVolume();

        int expected = 10;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(6);
        soundVolume.decreaseVolume();

        int expected = 5;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeTransition() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(0);
        soundVolume.decreaseVolume();

        int expected = 0;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheSoundVolumeAboveMax() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(11);

        int expected = 0;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheSoundVolumeAboveMin() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheSoundVolume() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(6);

        int expected = 6;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
