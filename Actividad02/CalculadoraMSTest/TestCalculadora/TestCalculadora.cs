using Microsoft.VisualStudio.TestTools.UnitTesting;
using CalculadoraMSTest;

[TestClass]
public class TestCalculadora
{
    [TestMethod]
    public void TestSumarPositivos()
    {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.Sumar(3, 5);
        // Assert
        Assert.AreEqual(8, resultado);
    }
    [TestMethod]
    public void TestSumarNegativos()
    {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.Sumar(-2, -4);
        // Assert
        Assert.AreEqual(-6, resultado);
    }
    [TestMethod]
    public void TestSumarMezclados()
    {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.Sumar(10, -7);
        // Assert
        Assert.AreEqual(3, resultado);
    }
}