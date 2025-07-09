# **EASY**
### Добавить метод удаления цветка по ID.
Добавь в FlowerServiceImpl метод _deleteFlowerById(Integer id)_, 
который удаляет цветок по ID. 
Если цветок не найден — выбрасывай _FlowerNotFoundException_.



# **MEDIUM**

### Добавить фильтрацию по категории.

Добавь метод _getFlowersByCategoryId(Integer categoryId)_, 
который возвращает _список_ цветов, 
принадлежащих к определённой категории.



# **HARD**

### Добавить обновление информации о цветке.

Реализуй метод _updateFlower(Integer id, FlowerDto flowerDto)_, 
который обновляет данные существующего цветка. 
Обновляемые поля: _name, price, size, category_.

