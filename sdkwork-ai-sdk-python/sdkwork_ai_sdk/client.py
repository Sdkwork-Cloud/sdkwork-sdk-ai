from .http_client import HttpClient, SdkConfig
from .api.open import OpenApi
from .api.chat import ChatApi
from .api.video import VideoApi
from .api.thread import ThreadApi
from .api.response import ResponseApi
from .api.rerank import RerankApi
from .api.music import MusicApi
from .api.moderation import ModerationApi
from .api.message import MessageApi
from .api.knowledge_base import KnowledgeBaseApi
from .api.image import ImageApi
from .api.file import FileApi
from .api.embedding import EmbeddingApi
from .api.context import ContextApi
from .api.batch import BatchApi
from .api.audio import AudioApi
from .api.assistant import AssistantApi
from .api.model import ModelApi


class SdkworkAiClient:
    """sdkwork-ai-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.open: OpenApi
        self.chat: ChatApi
        self.video: VideoApi
        self.thread: ThreadApi
        self.response: ResponseApi
        self.rerank: RerankApi
        self.music: MusicApi
        self.moderation: ModerationApi
        self.message: MessageApi
        self.knowledge_base: KnowledgeBaseApi
        self.image: ImageApi
        self.file: FileApi
        self.embedding: EmbeddingApi
        self.context: ContextApi
        self.batch: BatchApi
        self.audio: AudioApi
        self.assistant: AssistantApi
        self.model: ModelApi

        # Initialize API modules
        self.open = OpenApi(self._client)
        self.chat = ChatApi(self._client)
        self.video = VideoApi(self._client)
        self.thread = ThreadApi(self._client)
        self.response = ResponseApi(self._client)
        self.rerank = RerankApi(self._client)
        self.music = MusicApi(self._client)
        self.moderation = ModerationApi(self._client)
        self.message = MessageApi(self._client)
        self.knowledge_base = KnowledgeBaseApi(self._client)
        self.image = ImageApi(self._client)
        self.file = FileApi(self._client)
        self.embedding = EmbeddingApi(self._client)
        self.context = ContextApi(self._client)
        self.batch = BatchApi(self._client)
        self.audio = AudioApi(self._client)
        self.assistant = AssistantApi(self._client)
        self.model = ModelApi(self._client)

    def set_api_key(self, api_key: str) -> 'SdkworkAiClient':
        """Set API key for authentication."""
        self._client.set_api_key(api_key)
        return self

    def set_auth_token(self, token: str) -> 'SdkworkAiClient':
        """Set auth token for authentication."""
        self._client.set_auth_token(token)
        return self

    def set_access_token(self, token: str) -> 'SdkworkAiClient':
        """Set access token for authentication."""
        self._client.set_access_token(token)
        return self

    def set_header(self, key: str, value: str) -> 'SdkworkAiClient':
        """Set custom header."""
        self._client.set_header(key, value)
        return self

    @property
    def http(self) -> HttpClient:
        """Get the underlying HTTP client."""
        return self._client


def create_client(config: SdkConfig) -> SdkworkAiClient:
    """Create a new SDK client instance."""
    return SdkworkAiClient(config)
