package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу со счетами клиентов
 *
 * @author Podgorny K
 */
public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавления пользователя в систему
     *
     * @param user добавляемый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавления нового счета пользователю
     *
     * @param passport номер паспорта
     * @param account  новый счет
     */
    public void addAccount(String passport, Account account) {
        User usr = findByPassport(passport);
        if (usr != null && !users.get(usr).contains(account)) {
            users.get(usr).add(account);
        }
    }

    /**
     * Метод для поиска пользователя по номеру паспорта
     *
     * @param passport номер паспорта
     * @return искомый пользователь
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод для поиска пользователя по реквизитам
     *
     * @param passport  номер паспорта
     * @param requisite реквизиты
     * @return искомый пользователь
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User usr = findByPassport(passport);
        if (usr != null) {
            for (Account account : users.get(usr)) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод для перечисления денег между счетами
     *
     * @param srcPassport   номер паспорта отпрвителя
     * @param srcRequisite  реквизиты отпрвителя
     * @param destPassport  номер паспорта получателя
     * @param destRequisite реквизиты получателя
     * @param amount        сумма перевода
     * @return результат перевода суммы
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        boolean rsl = true;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}