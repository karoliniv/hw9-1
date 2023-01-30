import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // RADIO STATION
    @Test
    public void shouldTurnOnTheNextRadioStation() {
        Radio radioStation = new Radio();

        radioStation.next(4);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnTheNextRadioStationTransition() {
        Radio radioStation = new Radio();

        radioStation.next(9);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStation() {
        Radio radioStation = new Radio();

        radioStation.prev(4);

        int expected = 3;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnThePreviousRadioStationTransition() {
        Radio radioStation = new Radio();

        radioStation.prev(0);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTheRadioStationAboveMax() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(11);

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

        soundVolume.increaseVolume(7);

        int expected = 8;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeTransition() {
        Radio soundVolume = new Radio();

        soundVolume.increaseVolume(10);

        int expected = 10;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio soundVolume = new Radio();

        soundVolume.decreaseVolume(5);

        int expected = 4;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeTransition() {
        Radio soundVolume = new Radio();

        soundVolume.decreaseVolume(0);

        int expected = 0;
        int actual = soundVolume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
