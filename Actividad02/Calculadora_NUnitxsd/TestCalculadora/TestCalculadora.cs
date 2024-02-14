using NUnit.Framework;
using Calculadora_NUnit;

[TestFixture]
public class TestCalculadora
{
    [Test]
    public void TestSumarPositivos()
    {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.Sumar(3, 5);
        // Assert
        Assert.AreEqual(8, resultado);
    }
    [Test]
    public void TestSumarNegativos()
    {
        // Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.Sumar(-2, -4);
        // Assert
        Assert.AreEqual(-6, resultado);
    }
    [Test]
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