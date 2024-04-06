USE [DC REPORT]
GO

/****** Object:  StoredProcedure [dbo].[pr_CalculaVacacionesTotales]    Script Date: 05/04/2024 06:02:56 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[pr_CalculaVacacionesTotales]
AS
BEGIN
	--establece las los totales en 0
    UPDATE [DC_Vaciones_Disponibles]
    SET [VacacionesPorAnio] = 
        CASE
            WHEN DATEDIFF(MONTH, [FechaIngreso], GETDATE()) BETWEEN 6 AND 11 THEN 6
			WHEN DATEDIFF(MONTH, [FechaIngreso], GETDATE()) BETWEEN 12 AND 23 THEN  12
            WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE())= 2  THEN  14
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE())= 3  THEN 16
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE())= 4  THEN  18
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE())= 5  THEN 20
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN  6 AND 10  THEN 22
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN 11 AND 15  THEN 24
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN 16 AND 20  THEN 26
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN 21 AND 25  THEN 28
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN 26 AND 30  THEN 30
			WHEN DATEDIFF(YEAR, [FechaIngreso], GETDATE()) BETWEEN 31 AND 35  THEN 32
            ELSE [VacacionesPorAnio]
        END
    WHERE DATEDIFF(MONTH, [FechaIngreso], GETDATE()) >= 6;

    UPDATE [DC_Vaciones_Disponibles] 
    SET [VacacionesDisponibles] = ([VacacionesPorAnio] - [VacacionesTomadas]);
END;
GO


