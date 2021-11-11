class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("cc.cube 3 should be 27") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("cc.cube - should be 0") {
    assert(CubeCalculator.cube(0) === 0)
  }
}
