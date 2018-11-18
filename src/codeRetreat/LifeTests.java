package codeRetreat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LifeTests {

  @Test
  void isAliveTest() {
    Cell cell = new Cell();
    assertTrue(cell.isAlive());
  }

}
