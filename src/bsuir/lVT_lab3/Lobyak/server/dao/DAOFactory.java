package bsuir.lVT_lab3.Lobyak.server.dao;

import bsuir.lVT_lab3.Lobyak.server.dao.impl.ApplianceDAOImpl;

public final class DAOFactory {
 private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory() {}

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
