package com.bsavoini.repository.converters

import com.bsavoini.repository.models.FavoriteEntity as RepositoryFavoriteEntity
import com.bsavoini.repository.models.MediaType as RepositoryMediaType
import com.bsavoini.storage.entities.FavoriteEntity as StorageFavoriteEntity
import com.bsavoini.storage.entities.MediaType as StorageMediaType

fun RepositoryFavoriteEntity.toStorageFavoriteEntity(timestamp: Long) = StorageFavoriteEntity(
    id = this.id,
    mediaType = this.mediaType.toStorageMediaType(),
    timestamp = timestamp
)

fun StorageFavoriteEntity.toRepositoryFavoriteEntity() = RepositoryFavoriteEntity(
    id = this.id,
    mediaType = this.mediaType.toRepositoryMediaType()
)

fun RepositoryMediaType.toStorageMediaType() = StorageMediaType.valueOf(this.name)

fun StorageMediaType.toRepositoryMediaType() = RepositoryMediaType.valueOf(this.name)


