package com.example.tasklist.service;


import com.example.tasklist.domain.user.User;

//в этом сервисе будут вызываться методы которые необходимы для взаимодействия с юзером
public interface UserService {

    User getById(Long id); // в репозитории мы называем метод findById потому что он может вернуть Null либо объект, сервис уже возвращает объект либо исключение если такого объекта нет, конкретно сервис занимется тем что бы проверять Optional на пустоту

    User getByUserName(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);
    void delete(Long id);



}
