import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void isPrimeV1() {
    Assertions.assertFalse(Main.isPrimeV1(-10));
    Assertions.assertFalse(Main.isPrimeV1(0));
    Assertions.assertFalse(Main.isPrimeV1(1));
    Assertions.assertFalse(Main.isPrimeV1(4));
    Assertions.assertFalse(Main.isPrimeV1(6));
    Assertions.assertFalse(Main.isPrimeV1(8));
    Assertions.assertFalse(Main.isPrimeV1(10));
    Assertions.assertFalse(Main.isPrimeV1(12));
    Assertions.assertFalse(Main.isPrimeV1(100));
    Assertions.assertFalse(Main.isPrimeV1(256));
    Assertions.assertFalse(Main.isPrimeV1(512));
    Assertions.assertFalse(Main.isPrimeV1(1024));

    Assertions.assertTrue(Main.isPrimeV1(2));
    Assertions.assertTrue(Main.isPrimeV1(3));
    Assertions.assertTrue(Main.isPrimeV1(5));
    Assertions.assertTrue(Main.isPrimeV1(7));
    Assertions.assertTrue(Main.isPrimeV1(11));
    Assertions.assertTrue(Main.isPrimeV1(13));
    Assertions.assertTrue(Main.isPrimeV1(17));
    Assertions.assertTrue(Main.isPrimeV1(137));
    Assertions.assertTrue(Main.isPrimeV1(283));
    Assertions.assertTrue(Main.isPrimeV1(419));
    Assertions.assertTrue(Main.isPrimeV1(1289));
    Assertions.assertTrue(Main.isPrimeV1(1511));
    Assertions.assertTrue(Main.isPrimeV1(3083));
    Assertions.assertTrue(Main.isPrimeV1(3491));
    Assertions.assertTrue(Main.isPrimeV1(3533));
    Assertions.assertTrue(Main.isPrimeV1(6073));
    Assertions.assertTrue(Main.isPrimeV1(9931));
    Assertions.assertTrue(Main.isPrimeV1(9973));
  }

  @Test
  void isPrimeV2() {
    Assertions.assertFalse(Main.isPrimeV2(-10));
    Assertions.assertFalse(Main.isPrimeV2(0));
    Assertions.assertFalse(Main.isPrimeV2(1));
    Assertions.assertFalse(Main.isPrimeV2(4));
    Assertions.assertFalse(Main.isPrimeV2(6));
    Assertions.assertFalse(Main.isPrimeV2(8));
    Assertions.assertFalse(Main.isPrimeV2(10));
    Assertions.assertFalse(Main.isPrimeV2(12));
    Assertions.assertFalse(Main.isPrimeV2(100));
    Assertions.assertFalse(Main.isPrimeV2(256));
    Assertions.assertFalse(Main.isPrimeV2(512));
    Assertions.assertFalse(Main.isPrimeV2(1024));

    Assertions.assertTrue(Main.isPrimeV2(2));
    Assertions.assertTrue(Main.isPrimeV2(3));
    Assertions.assertTrue(Main.isPrimeV2(5));
    Assertions.assertTrue(Main.isPrimeV2(7));
    Assertions.assertTrue(Main.isPrimeV2(11));
    Assertions.assertTrue(Main.isPrimeV2(13));
    Assertions.assertTrue(Main.isPrimeV2(17));
    Assertions.assertTrue(Main.isPrimeV2(137));
    Assertions.assertTrue(Main.isPrimeV2(283));
    Assertions.assertTrue(Main.isPrimeV2(419));
    Assertions.assertTrue(Main.isPrimeV2(1289));
    Assertions.assertTrue(Main.isPrimeV2(1511));
    Assertions.assertTrue(Main.isPrimeV2(3083));
    Assertions.assertTrue(Main.isPrimeV2(3491));
    Assertions.assertTrue(Main.isPrimeV2(3533));
    Assertions.assertTrue(Main.isPrimeV2(6073));
    Assertions.assertTrue(Main.isPrimeV2(9931));
    Assertions.assertTrue(Main.isPrimeV2(9973));
  }

  @Test
  void isPrimeV3() {
    Assertions.assertFalse(Main.isPrimeV3(-10));
    Assertions.assertFalse(Main.isPrimeV3(0));
    Assertions.assertFalse(Main.isPrimeV3(1));
    Assertions.assertFalse(Main.isPrimeV3(4));
    Assertions.assertFalse(Main.isPrimeV3(6));
    Assertions.assertFalse(Main.isPrimeV3(8));
    Assertions.assertFalse(Main.isPrimeV3(10));
    Assertions.assertFalse(Main.isPrimeV3(12));
    Assertions.assertFalse(Main.isPrimeV3(100));
    Assertions.assertFalse(Main.isPrimeV3(256));
    Assertions.assertFalse(Main.isPrimeV3(512));
    Assertions.assertFalse(Main.isPrimeV3(1024));

    Assertions.assertTrue(Main.isPrimeV3(2));
    Assertions.assertTrue(Main.isPrimeV3(3));
    Assertions.assertTrue(Main.isPrimeV3(5));
    Assertions.assertTrue(Main.isPrimeV3(7));
    Assertions.assertTrue(Main.isPrimeV3(11));
    Assertions.assertTrue(Main.isPrimeV3(13));
    Assertions.assertTrue(Main.isPrimeV3(17));
    Assertions.assertTrue(Main.isPrimeV3(137));
    Assertions.assertTrue(Main.isPrimeV3(283));
    Assertions.assertTrue(Main.isPrimeV3(419));
    Assertions.assertTrue(Main.isPrimeV3(1289));
    Assertions.assertTrue(Main.isPrimeV3(1511));
    Assertions.assertTrue(Main.isPrimeV3(3083));
    Assertions.assertTrue(Main.isPrimeV3(3491));
    Assertions.assertTrue(Main.isPrimeV3(3533));
    Assertions.assertTrue(Main.isPrimeV3(6073));
    Assertions.assertTrue(Main.isPrimeV3(9931));
    Assertions.assertTrue(Main.isPrimeV3(9973));
  }

  @Test
  void isPrimeV4() {
    Assertions.assertFalse(Main.isPrimeV4(-10));
    Assertions.assertFalse(Main.isPrimeV4(0));
    Assertions.assertFalse(Main.isPrimeV4(1));
    Assertions.assertFalse(Main.isPrimeV4(4));
    Assertions.assertFalse(Main.isPrimeV4(6));
    Assertions.assertFalse(Main.isPrimeV4(8));
    Assertions.assertFalse(Main.isPrimeV4(10));
    Assertions.assertFalse(Main.isPrimeV4(12));
    Assertions.assertFalse(Main.isPrimeV4(100));
    Assertions.assertFalse(Main.isPrimeV4(256));
    Assertions.assertFalse(Main.isPrimeV4(512));
    Assertions.assertFalse(Main.isPrimeV4(1024));

    Assertions.assertTrue(Main.isPrimeV4(2));
    Assertions.assertTrue(Main.isPrimeV4(3));
    Assertions.assertTrue(Main.isPrimeV4(5));
    Assertions.assertTrue(Main.isPrimeV4(7));
    Assertions.assertTrue(Main.isPrimeV4(11));
    Assertions.assertTrue(Main.isPrimeV4(13));
    Assertions.assertTrue(Main.isPrimeV4(17));
    Assertions.assertTrue(Main.isPrimeV4(137));
    Assertions.assertTrue(Main.isPrimeV4(283));
    Assertions.assertTrue(Main.isPrimeV4(419));
    Assertions.assertTrue(Main.isPrimeV4(1289));
    Assertions.assertTrue(Main.isPrimeV4(1511));
    Assertions.assertTrue(Main.isPrimeV4(3083));
    Assertions.assertTrue(Main.isPrimeV4(3491));
    Assertions.assertTrue(Main.isPrimeV4(3533));
    Assertions.assertTrue(Main.isPrimeV4(6073));
    Assertions.assertTrue(Main.isPrimeV4(9931));
    Assertions.assertTrue(Main.isPrimeV4(9973));
  }
}
