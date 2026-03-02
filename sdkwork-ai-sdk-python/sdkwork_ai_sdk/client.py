from .http_client import HttpClient, SdkConfig
from .api.chat import ChatApi
from .api.videos import VideosApi
from .api.threads import ThreadsApi
from .api.responses import ResponsesApi
from .api.rerank import RerankApi
from .api.music import MusicApi
from .api.moderations import ModerationsApi
from .api.chat_completions import ChatCompletionsApi
from .api.knowledge_bases import KnowledgeBasesApi
from .api.images import ImagesApi
from .api.files import FilesApi
from .api.embeddings import EmbeddingsApi
from .api.context import ContextApi
from .api.batches import BatchesApi
from .api.audio import AudioApi
from .api.assistants import AssistantsApi
from .api.models import ModelsApi


class SdkworkAiClient:
    """sdkwork-ai-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.chat: ChatApi
        self.videos: VideosApi
        self.threads: ThreadsApi
        self.responses: ResponsesApi
        self.rerank: RerankApi
        self.music: MusicApi
        self.moderations: ModerationsApi
        self.chat_completions: ChatCompletionsApi
        self.knowledge_bases: KnowledgeBasesApi
        self.images: ImagesApi
        self.files: FilesApi
        self.embeddings: EmbeddingsApi
        self.context: ContextApi
        self.batches: BatchesApi
        self.audio: AudioApi
        self.assistants: AssistantsApi
        self.models: ModelsApi

        # Initialize API modules
        self.chat = ChatApi(self._client)
        self.videos = VideosApi(self._client)
        self.threads = ThreadsApi(self._client)
        self.responses = ResponsesApi(self._client)
        self.rerank = RerankApi(self._client)
        self.music = MusicApi(self._client)
        self.moderations = ModerationsApi(self._client)
        self.chat_completions = ChatCompletionsApi(self._client)
        self.knowledge_bases = KnowledgeBasesApi(self._client)
        self.images = ImagesApi(self._client)
        self.files = FilesApi(self._client)
        self.embeddings = EmbeddingsApi(self._client)
        self.context = ContextApi(self._client)
        self.batches = BatchesApi(self._client)
        self.audio = AudioApi(self._client)
        self.assistants = AssistantsApi(self._client)
        self.models = ModelsApi(self._client)

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
