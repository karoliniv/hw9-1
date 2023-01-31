import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // HOMEWORK 9.1

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

        soundVolume.setCurrentSoundVolume(55);
        soundVolume.increaseVolume();

        int expected = 56;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeTransition() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(100);
        soundVolume.increaseVolume();

        int expected = 100;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio soundVolume = new Radio();

        soundVolume.setCurrentSoundVolume(64);
        soundVolume.decreaseVolume();

        int expected = 63;
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

        soundVolume.setCurrentSoundVolume(101);

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

        soundVolume.setCurrentSoundVolume(68);

        int expected = 68;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    // HOMEWORK 10.1
    // RADIO STATION

    @Test
    public void shouldSetCurrentTheRadioStationSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(12);

        int expected = 12;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnTheNextRadioStationSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(15);
        radioStation.next();

        int expected = 16;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnTheNextRadioStationTransitionSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(19);
        radioStation.next();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStationSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(15);
        radioStation.prev();

        int expected = 14;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStationTransitionSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(0);
        radioStation.prev();

        int expected = 19;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheRadioStationAboveMaxSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(20);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheRadioStationAboveMinSize() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
